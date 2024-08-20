import styles from './Card.module.css';
import { MouseEventHandler } from 'react'; // Import MouseEventHandler

const Card = ({ description, onEdit, onDelete }: { description: String, onEdit: MouseEventHandler<HTMLButtonElement>, onDelete: MouseEventHandler<HTMLButtonElement> }) => {
    return (
        <div className={styles.card}>
            <div>
                <p>{description}</p>
            </div>

            <div className={styles.actions}>
                <button onClick={onEdit} className={styles.editButton}>Editar</button>
                <button onClick={onDelete} className={styles.deleteButton}>Remover</button>
            </div>
        </div>
    );
};

export default Card;