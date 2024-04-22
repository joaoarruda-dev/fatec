
import React from 'react';
import styles from '@/app/page.module.css'; // Importa os estilos CSS
import FractionForm from '../components/FractionForm';
import fracaoImage from "@/app/assets/fracao.jpg"
import Image from 'next/image';


const Page = () => {
    return (
        <div>
            <div className={styles.container}>
                <h1 className={styles.title}>Exercício Fração</h1>

                <Image
                    src={fracaoImage}
                    height={300}
                    alt="Descrição da imagem"
                />
                <FractionForm />
            </div>
        </div>
    );
};

export default Page;