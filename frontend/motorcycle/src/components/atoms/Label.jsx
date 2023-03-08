export default function Label({ name }) {
    return (
    <label for={name}>{name}</label>
    );
}