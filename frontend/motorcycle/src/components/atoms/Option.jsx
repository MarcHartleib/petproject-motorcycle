export default function Option({ id, options, onChange }) {
  return (
    <select id={id} defaultValue={options[0]} onChange={onChange}>
      <option value="">--Choose an option--</option>
      {options.map((option, index) => (
        <option key={index} value={option.toUpperCase()}>
          {option}
        </option>
      ))}
    </select>
  );
}
