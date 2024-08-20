import { MouseEvent, useEffect, useState } from "react";
import Card from "../Card";
import EditModal from "../EditModal";

const LogComponent = () => {
    const [contas, setContas] = useState([]);
    const [isModalOpen, setIsModalOpen] = useState(false);
    const [selectedCard, setSelectedCard] = useState(null);


    const openModal = (conta: any) => {
        setSelectedCard(conta);
        setIsModalOpen(true);
    };

    const closeModal = () => {
        setIsModalOpen(false);
        setSelectedCard(null);
    };

    const updateListaContas = () => {
        fetch("http://localhost:8080/fracao/contas")
            .then(async (response: Response) => {
                if (!response.ok) {
                    throw new Error(`Erro ao fazer requisição: ${response.status}`);
                }
                const res = await response.json();
                setContas(res.data)
            })
            .catch(error => {
                alert("Erro ao fazer requisição")
            });
    };

    const deleteConta = (contaId: number) => {
        fetch(`http://localhost:8080/fracao/conta/${contaId}`, {
            method: 'DELETE',
            headers: {
                'Content-Type': 'application/json'
            },
        })
            .then(async (response: Response) => {
                if (!response.ok) {
                    throw new Error(`Erro ao fazer requisição: ${response.status}`);
                }
                updateListaContas();
            })
            .catch(error => {
                alert("Erro ao fazer requisição")
            });
    };

    const formatConta = (conta: any) => {
        let operation = "";
        switch (conta.operacao) {
            case 'sub':
                operation = "-";
                break;
            case 'soma':
                operation = "+";
                break;
            case 'div':
                operation = "÷";
                break;
            case 'mult':
                operation = "*";
                break;
        }
        return `${conta.f1Num}/${conta.f1Den} ${operation} ${conta.f2Num}/${conta.f2Den} = ${conta.resultado.numerador}/${conta.resultado.denominador}`
    };

    useEffect(() => {
        updateListaContas();
    }, []);


    const updateConta = (conta: any) => {
        const { contaId, numerator1, numerator2, denominator1, denominator2 } = conta;
        fetch(`http://localhost:8080/fracao/conta/${contaId}?novoNumeradorA=${numerator1}&novoDenominadorA=${denominator1}&novoNumeradorB=${numerator2}&novoDenominadorB=${denominator2}`, {
            method: 'PUT',
            headers: {
                'Content-Type': 'application/json'
            },
        })
            .then(async (response: Response) => {
                if (!response.ok) {
                    throw new Error(`Erro ao fazer requisição: ${response.status}`);
                }
                updateListaContas();
            })
            .catch(error => {
                alert("Erro ao fazer requisição")
            });
    };



    return (
        <>
            {contas.map((conta: any) => {
                return <Card description={formatConta(conta)} key={conta.contaId} onEdit={() => openModal(conta)} onDelete={() => { deleteConta(conta.contaId) }} />
            })}

            {selectedCard && (
                <EditModal
                    isOpen={isModalOpen}
                    onRequestClose={closeModal}
                    card={selectedCard}
                    onSave={updateConta}
                />
            )}
        </>
    );
};

export default LogComponent;