
import React from 'react';
import styles from '@/app/page.module.css'; // Importa os estilos CSS
import CelForm from '../components/CelForm';
import fracaoImage from "@/app/assets/celulares.jpeg"
import Image from 'next/image';

const Page = () => {
    return (
        <div>
            <div className={styles.container}>
                <h1 className={styles.title}>Exercício 1</h1>
                <Image
                    src={fracaoImage}
                    height={300}
                    alt="Descrição da imagem"
                />
                <CelForm />
            </div>
        </div>
    );
};

export default Page;