'use client';


import React, { useState, FormEvent } from 'react';

const BeerForm: React.FC = () => {
    const [quantidade, setQuantidade] = useState('');


    const abrir = (e: FormEvent) => {
        e.preventDefault();
        const options = {
            method: 'GET',
            headers: {
                'Content-Type': 'application/json',
            },
        };
        fetch("http://localhost:8080/cerveja/abrir", options)
            .then(async (response: Response) => {
                if (!response.ok) {
                    throw new Error(`Erro ao fazer requisição: ${response.status}`);
                }
                const res = await response.json();
                alert(res.mensagem);
            })
    };

    const beber = (e: FormEvent) => {
        e.preventDefault();
        const options = {
            method: 'GET',
            headers: {
                'Content-Type': 'application/json',
            },
        };
        fetch("http://localhost:8080/cerveja/beber", options)
            .then(async (response: Response) => {
                if (!response.ok) {
                    throw new Error(`Erro ao fazer requisição: ${response.status}`);
                }
                const res = await response.json();
                alert(res.mensagem);
            })
    };

    const adicionarCerveja = (e: FormEvent) => {
        e.preventDefault();
        const options = {
            method: 'GET',
            headers: {
                'Content-Type': 'application/json',
            },
        };
        fetch("http://localhost:8080/cerveja/adicionar?" + "quantidade=" + quantidade, options)
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

                <form onSubmit={adicionarCerveja} className="">
                    <div className="mb-4">
                        <input
                            className="w-full px-3 py-2 border border-gray-300 rounded"
                            placeholder="Quantidade de cerveja"
                            value={quantidade}
                            onChange={(e) => setQuantidade(e.target.value)}
                            required
                        />
                    </div>
                    <button
                        className="w-full mt-5 px-4 py-2 text-white bg-blue-500 rounded hover:bg-blue-600"
                        type="submit"
                    >
                        Adicionar cerveja
                    </button>

                </form>
            </div >
            <div className="max-w-md ml-5 mt-5 mx-auto p-6 bg-white rounded shadow-md">

                <form onSubmit={abrir}>
                    <button
                        className="w-full px-4 py-2 text-white bg-blue-500 rounded hover:bg-blue-600"
                        type="submit"
                    >
                        Abrir cerveja
                    </button>

                </form>
                <form onSubmit={beber}>
                    <button
                        className="w-full mt-5 px-4 py-2 text-white bg-blue-500 rounded hover:bg-blue-600"
                        type="submit"
                    >
                        Beber cerveja
                    </button>

                </form>
            </div>

        </div>

    );
};

export default BeerForm;