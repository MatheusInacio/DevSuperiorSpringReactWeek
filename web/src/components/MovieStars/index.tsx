import { type } from "os";
import { FaAngleLeft, FaAngleRight } from "react-icons/fa";
import StarRatings from 'react-star-ratings';

import './styles.css';

type Props = {
    score: number
}

export function MovieStars( {score} : Props) {
    return (
        <div className="dsmovie-stars-container mb-2">
            <StarRatings
                rating={score}
                starRatedColor="#FFBB3A"
                // changeRating={this.changeRating}
                numberOfStars={5}
                name='rating' 
                starDimension="20"
                starSpacing="10"
            />
        </div>
    );
}

