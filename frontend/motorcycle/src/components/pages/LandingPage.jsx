
import LinkButton from "../atoms/LinkButton";
import Landing from "../organisms/Landing";



export default function LandingPage( onClick ) {



    return (
        <div>
            <Landing>
                <LinkButton name={'Motorcycles'} pageLink={'/motorcycles'} onClick={onClick}/>
                <LinkButton name={'Add Motorcycle'}/>
                <LinkButton name={'Logout'}/>
            </Landing>
        </div>
    )
}