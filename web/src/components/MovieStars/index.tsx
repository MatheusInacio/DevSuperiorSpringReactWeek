import { FaAngleLeft, FaAngleRight } from "react-icons/fa";
import StarRatings from 'react-star-ratings';

import './styles.css';

export function MovieStars() {
    return (
        <div className="dsmovie-stars-container mb-2">
            <StarRatings
                rating={3.5}
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

