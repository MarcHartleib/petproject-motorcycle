export default function Option({ id, options }) {
    return (
        <select id={id}>
            {options.map((option, index) => (
                <option key={index} value={options}>{option}</option>
            ))}
        </select>
    )
}