
import React from 'react';
import styles from '@/app/page.module.css'; // Importa os estilos CSS
import CarForm from '../components/CarForm';
import fracaoImage from "@/app/assets/carros.png"
import Image from 'next/image';

const Page = () => {
    return (
        <div>
            <div className={styles.container}>
                <h1 className={styles.title}>Exercício 2</h1>
                <Image
                    src={fracaoImage}
                    height={300}
                    alt="Descrição da imagem"
                />
                <CarForm />            
            </div>
        </div>
    );
};

export default Page;