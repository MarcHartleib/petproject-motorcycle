export default function Option({ id, options }) {
    return (
        <select id={id}>
            {options.map((option) => (
                <option key={option.id} value={options}>{option}</option>
            ))}
        </select>
    )
}