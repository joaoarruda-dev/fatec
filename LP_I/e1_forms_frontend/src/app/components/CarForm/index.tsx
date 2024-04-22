'use client';


import React, { useState, FormEvent } from 'react';

const CarForm: React.FC = () => {
    const [marcha, setMarcha] = useState('');


    const andar = (e: FormEvent) => {
        e.preventDefault();
        const options = {
            method: 'GET',
            headers: {
                'Content-Type': 'application/json',
            },
        };
        fetch("http://localhost:8080/carro/andar", options)
            .then(async (response: Response) => {
                if (!response.ok) {
                    throw new Error(`Erro ao fazer requisição: ${response.status}`);
                }
                const res = await response.json();
                alert(res.mensagem);
            })
    };

    const freiar = (e: FormEvent) => {
        e.preventDefault();
        const options = {
            method: 'GET',
            headers: {
                'Content-Type': 'application/json',
            },
        };
        fetch("http://localhost:8080/carro/freiar", options)
            .then(async (response: Response) => {
                if (!response.ok) {
                    throw new Error(`Erro ao fazer requisição: ${response.status}`);
                }
                const res = await response.json();
                alert(res.mensagem);
            })
    };

    const trocarMarcha = (e: FormEvent) => {
        e.preventDefault();
        const options = {
            method: 'GET',
            headers: {
                'Content-Type': 'application/json',
            },
        };
        fetch("http://localhost:8080/carro/trocar?" + "marcha=" + marcha, options)
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

                <form onSubmit={trocarMarcha} className="">
                    <div className="mb-4">
                        <input
                            className="w-full px-3 py-2 border border-gray-300 rounded"
                            placeholder="Marcha"
                            value={marcha}
                            onChange={(e) => setMarcha(e.target.value)}
                            required
                        />
                    </div>
                    <button
                        className="w-full mt-5 px-4 py-2 text-white bg-blue-500 rounded hover:bg-blue-600"
                        type="submit"
                    >
                        Trocar marcha
                    </button>

                </form>
            </div >
            <div className="max-w-md ml-5 mt-5 mx-auto p-6 bg-white rounded shadow-md">

                <form onSubmit={andar}>
                    <button
                        className="w-full px-4 py-2 text-white bg-blue-500 rounded hover:bg-blue-600"
                        type="submit"
                    >
                        Andar
                    </button>

                </form>
                <form onSubmit={freiar}>
                    <button
                        className="w-full mt-5 px-4 py-2 text-white bg-blue-500 rounded hover:bg-blue-600"
                        type="submit"
                    >
                        Freiar
                    </button>

                </form>
            </div>

        </div>

    );
};

export default CarForm;