import React, { useState } from 'react';
import Modal from 'react-modal';
import styles from './EditModal.module.css';


const EditModal = ({ isOpen, onRequestClose, card, onSave }: { isOpen: boolean, onRequestClose: () => void, card: any, onSave: (data: any) => void }) => {
    console.log(card);
    
    const [numerator1, setNumerator1] = useState(card.f1Num);
    const [denominator1, setDenominator1] = useState(card.f1Den);
    const [numerator2, setNumerator2] = useState(card.f2Num);
    const [denominator2, setDenominator2] = useState(card.f2Den);

    const handleSave = () => {
        onSave({ ...card, numerator1, denominator1, numerator2, denominator2});
        onRequestClose();
    };

    return (
        <Modal
            isOpen={isOpen}
            onRequestClose={onRequestClose}
            contentLabel="Editar Fração"
            className={styles.modal}
            overlayClassName={styles.overlay}
        >
            <h2>Editar Fração</h2>
            <label className={styles.label}>
                Numerador 1:
                <input
                    className={styles.input}
                    type="number"
                    value={numerator1}
                    onChange={(e) => setNumerator1(e.target.value)}
                />
            </label>
            <label className={styles.label}>
                Denominador 1:
                <input className={styles.input}
                    type="number"
                    value={denominator1}
                    onChange={(e) => setDenominator1(e.target.value)}
                />
            </label>

            <label className={styles.label}>
                Numerador 2:
                <input
                    className={styles.input}
                    type="number"
                    value={numerator2}
                    onChange={(e) => setNumerator2(e.target.value)}
                />
            </label>
            <label className={styles.label}>
                Denominador 2:
                <input className={styles.input}
                    type="number"
                    value={denominator2}
                    onChange={(e) => setDenominator2(e.target.value)}
                />
            </label>
            <button className={styles.button} onClick={handleSave}>Salvar</button>
            <button className={styles.button} onClick={onRequestClose}>Cancelar</button>
        </Modal>
    );
};

export default EditModal;