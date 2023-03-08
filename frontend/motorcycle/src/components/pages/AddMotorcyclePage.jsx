import Label from "../atoms/Label";
import LinkButton from "../atoms/LinkButton";
import Option from "../atoms/Option";
import OptionSelectLabel from "../molecules/OptionSelectLabel";
import NavBar from "../organisms/NavBar";

export default function AddMotorcyclePage() {
    console.log("test");

    const formData = {
        manufacturers : {
            title: "Manufacturers",
            list: ["Honda", "Kawasaki", "Indian", "BMW"]
        },
        models : {
            title: "Model",
            list: ["Cruiser", "Supersport", "Adventure"]
        },
        drives : {
            title: "Drivetrain",
            list: ["Belt", "Chain", "Drivetrain"]
        }

    };



    return (
        <div>
            <NavBar>
                <LinkButton name={'Home'} pageLink={'/'}/>
                <LinkButton name={'Logout'}/>
            </NavBar>
            <form>
                <OptionSelectLabel data={formData.manufacturers}/>

                
                
                
            </form>
        </div>
    )
}