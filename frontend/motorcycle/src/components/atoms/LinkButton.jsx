import { Link } from 'react-router-dom'

export default function LinkButton({ name, pageLink, onClick }) {
    return (
        <Link to={pageLink}><button onClick={onClick}>{name}</button></Link>
    )
}