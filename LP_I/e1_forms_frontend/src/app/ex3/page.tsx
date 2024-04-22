
import React from 'react';
import styles from '@/app/page.module.css'; // Importa os estilos CSS
import BeerForm from '../components/BeerForm';
import fracaoImage from "@/app/assets/cervejas.webp"
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
                <BeerForm />            
            </div>
        </div>
    );
};

export default Page;