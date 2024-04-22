'use client';


import React, { useState, FormEvent } from 'react';

const CelForm: React.FC = () => {
    const [nome, setNome] = useState('');
    const [numero, setNumero] = useState('');


    const ligarCel = (e: FormEvent) => {
        e.preventDefault();
        const options = {
            method: 'GET',
            headers: {
                'Content-Type': 'application/json',
            },
        };
        fetch("http://localhost:8080/celular/ligar", options)
            .then(async (response: Response) => {
                if (!response.ok) {
                    throw new Error(`Erro ao fazer requisição: ${response.status}`);
                }
                const res = await response.json();
                alert(res.mensagem);
            })
    };

    const desligarCel = (e: FormEvent) => {
        e.preventDefault();
        const options = {
            method: 'GET',
            headers: {
                'Content-Type': 'application/json',
            },
        };
        fetch("http://localhost:8080/celular/desligar", options)
            .then(async (response: Response) => {
                if (!response.ok) {
                    throw new Error(`Erro ao fazer requisição: ${response.status}`);
                }
                const res = await response.json();
                alert(res.mensagem);
            })
    };

    const adicionarContato = (e: FormEvent) => {
        e.preventDefault();
        const options = {
            method: 'GET',
            headers: {
                'Content-Type': 'application/json',
            },
        };
        fetch("http://localhost:8080/celular/adicionar?" + "nome=" + nome + "&numero=" + numero, options)
            .then(async (response: Response) => {
                if (!response.ok) {
                    throw new Error(`Erro ao fazer requisição: ${response.status}`);
                }
                const res = await response.json();
                alert(res.mensagem);
            })
    };

    return (
        <div className='flex'>
            <div className="max-w-md mt-5 mx-auto p-6 bg-white rounded shadow-md">

                <form onSubmit={adicionarContato} className="">
                    <div className="mb-4">
                        <input
                            className="w-full px-3 py-2 border border-gray-300 rounded"
                            placeholder="Nome"
                            value={nome}
                            onChange={(e) => setNome(e.target.value)}
                            required
                        />
                    </div>
                    <div className="mb-4">
                        <input
                            className="w-full px-3 py-2 border border-gray-300 rounded"
                            placeholder="Numero"
                            value={numero}
                            onChange={(e) => setNumero(e.target.value)}
                            required
                        />
                    </div>
                    <button
                        className="w-full mt-5 px-4 py-2 text-white bg-blue-500 rounded hover:bg-blue-600"
                        type="submit"
                    >
                        Adicionar celular
                    </button>

                </form>
            </div >
            <div className="max-w-md ml-5 mt-5 mx-auto p-6 bg-white rounded shadow-md">

                <form onSubmit={ligarCel}>
                    <button
                        className="w-full px-4 py-2 text-white bg-blue-500 rounded hover:bg-blue-600"
                        type="submit"
                    >
                        Ligar celular
                    </button>

                </form>
                <form onSubmit={desligarCel}>
                    <button
                        className="w-full mt-5 px-4 py-2 text-white bg-blue-500 rounded hover:bg-blue-600"
                        type="submit"
                    >
                        Desligar celular
                    </button>

                </form>
            </div>

        </div>

    );
};

export default CelForm;