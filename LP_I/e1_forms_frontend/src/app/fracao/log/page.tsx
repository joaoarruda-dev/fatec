'use client';
import React from 'react';
import styles from '@/app/page.module.css'; // Importa os estilos CSS
import fracaoImage from "@/app/assets/fracao.jpg"
import Image from 'next/image';
import Card from '@/app/components/Card';
import LogComponent from '@/app/components/LogComponent';


const Page = () => {
    return (
        <div>
            <div className={styles.container}>
                <h1 className={styles.title}>Logs Fração</h1>
                <LogComponent />
            </div>
        </div>
    );
};

export default Page;