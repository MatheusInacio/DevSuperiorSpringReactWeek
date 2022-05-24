import { FaAngleLeft, FaAngleRight } from "react-icons/fa";

import './styles.css';

export function Pagination() {
    return (
        <div className="dsmovie-pagination-container">
        <div className="dsmovie-pagination-box">
            <button className="dsmovie-pagination-button" disabled={true} >
                <FaAngleLeft />
            </button>
            <p>{`${1} de ${3}`}</p>
            <button className="dsmovie-pagination-button" disabled={false} >
                <FaAngleRight />
            </button>
        </div>
    </div>
    );
}
