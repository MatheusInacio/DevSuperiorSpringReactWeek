import { FaAngleLeft, FaAngleRight } from "react-icons/fa";
import { MoviePage } from "../../types/movie";

import './styles.css';

type Props = {
    page: MoviePage;
    onChange: Function;
    // onChange: (page: number) => void;
}

export function Pagination({ page, onChange }: Props) {
    return (
        <div className="dsmovie-pagination-container">
            <div className="dsmovie-pagination-box">
                <button className="dsmovie-pagination-button"
                    disabled={page.first}
                    onClick={() => onChange(page.number - 1)}>
                    <FaAngleLeft />
                </button>
                <p>{`${page.number + 1} de ${page.totalPages}`}</p>
                <button className="dsmovie-pagination-button"
                    disabled={page.last}
                    onClick={() => onChange(page.number + 1)} >
                    <FaAngleRight />
                </button>
            </div>
        </div>
    );
}
