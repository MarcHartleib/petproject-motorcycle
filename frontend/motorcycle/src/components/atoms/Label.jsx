export default function Label({ name }) {
    return (
    <label htmlFor={name}>{name}</label>
    );
}