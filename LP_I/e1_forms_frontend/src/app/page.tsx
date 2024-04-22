
import React from 'react';
import styles from './page.module.css'; // Importa os estilos CSS

const Home = () => {
  return (
    <div>
      <div className={styles.container}>
        <h1 className={styles.title}>Bem vindo a aula de Linguagem de Programação I</h1>
        <p className={styles.intro}>Aula ministrada pela Profa. Adriana na Faculdade de Tecnologia Prof. Jessen Vidal - São José dos Campos</p>
      </div>
    </div>
  );
};

export default Home;