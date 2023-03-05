import { Link } from 'react-router-dom'

export default function LinkButton({ name, pageLink }) {
    return (
        <Link to={pageLink}><button>{name}</button></Link>
    )
}