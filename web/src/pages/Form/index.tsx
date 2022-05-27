
import { useParams } from "react-router-dom";
import FormCard from "../../components/FormCard";
import "./styles.css";

function Form() {

    const params = useParams();

    return (
        <FormCard movieId={`${params.movieId}`} />
    )
}

export default Form;