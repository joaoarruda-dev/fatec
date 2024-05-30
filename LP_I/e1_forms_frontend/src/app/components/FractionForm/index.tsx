'use client';


import React, { useState, FormEvent } from 'react';

const FractionForm: React.FC = () => {
    const [numerator1, setNumerator1] = useState('');
    const [numerator2, setNumerator2] = useState('');

    const [denominator1, setDenominator1] = useState('');
    const [denominator2, setDenominator2] = useState('');

    const [result, setResult] = useState<string | null>(null);
    const [selectedOption, setSelectedOption] = useState<string | null>(null);

    const handleOptionChange = (option: string) => {
        setSelectedOption(option);
    };

    const handleSubmit = (e: FormEvent) => {
        e.preventDefault();
        if(!selectedOption){
            return alert("Selecione uma operação!");
        }
        const data =
            [
                {
                    denominador: denominator1,
                    numerador: numerator1
                },
                {
                    denominador: denominator2,
                    numerador: numerator2
                }
            ];
        const options = {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify(data),
        };
        fetch("http://localhost:8080/fracao?operacao="+selectedOption, options)
            .then(async (response: Response) => {
                if (!response.ok) {
                    throw new Error(`Erro ao fazer requisição: ${response.status}`);
                }
                const res = await response.json();
                setResult(`${res.numerador}/${res.denominador}`)
            })
            .catch(error => {
                alert("Valor inválido, coloque os denominadores corretamente")
            });
    };

    return (
        <>
            <form onSubmit={handleSubmit}>
                <div className='flex flex-row mb-20'>
                    <div className="max-w-md mx-auto p-6 bg-white rounded shadow-md">

                        <div className="mb-4">
                            <input
                                className="w-full px-3 py-2 border border-gray-300 rounded"
                                type="number"
                                placeholder="Numerador"
                                value={numerator1}
                                onChange={(e) => setNumerator1(e.target.value)}
                                required
                            />
                        </div>
                        <div className="mb-4">
                            <input
                                className="w-full px-3 py-2 border border-gray-300 rounded"
                                type="number"
                                placeholder="Denominador"
                                value={denominator1}
                                onChange={(e) => setDenominator1(e.target.value)}
                                required
                            />
                        </div>

                    </div >
                    <div className="flex flex-col m-5">
                        <label className="inline-flex items-center mb-2">
                            <input
                                type="radio"
                                className="form-radio h-5 w-5 text-blue-600"
                                checked={selectedOption === 'soma'}
                                onChange={() => handleOptionChange('soma')}
                            />
                            <span className="ml-2">Soma</span>
                        </label>
                        <label className="inline-flex items-center mb-2">
                            <input
                                type="radio"
                                className="form-radio h-5 w-5 text-blue-600"
                                checked={selectedOption === 'sub'}
                                onChange={() => handleOptionChange('sub')}
                            />
                            <span className="ml-2">Subtração</span>
                        </label>
                        <label className="inline-flex items-center mb-2">
                            <input
                                type="radio"
                                className="form-radio h-5 w-5 text-blue-600"
                                checked={selectedOption === 'mult'}
                                onChange={() => handleOptionChange('mult')}
                            />
                            <span className="ml-2">Multiplicação</span>
                        </label>
                        <label className="inline-flex items-center">
                            <input
                                type="radio"
                                className="form-radio h-5 w-5 text-blue-600"
                                checked={selectedOption === 'div'}
                                onChange={() => handleOptionChange('div')}
                            />
                            <span className="ml-2">Divisão</span>
                        </label>
                    </div>
                    <div className="max-w-md mx-auto p-6 bg-white rounded shadow-md">

                        <div className="mb-4">
                            <input
                                className="w-full px-3 py-2 border border-gray-300 rounded"
                                type="number"
                                placeholder="Numerador"
                                value={numerator2}
                                onChange={(e) => setNumerator2(e.target.value)}
                                required
                            />
                        </div>
                        <div className="mb-4">
                            <input
                                className="w-full px-3 py-2 border border-gray-300 rounded"
                                type="number"
                                placeholder="Denominador"
                                value={denominator2}
                                onChange={(e) => setDenominator2(e.target.value)}
                                required
                            />
                        </div>

                    </div >

                </div>
                <button
                    className="w-full px-4 py-2 text-white bg-blue-500 rounded hover:bg-blue-600"
                    type="submit"
                >
                    Calcular
                </button>

            </form>

            {result && <p className="mt-4">Resultado: {result}</p>}
        </>

    );
};

export default FractionForm;