import React , {Fragment} from 'react';

const Ship = (props) => {

	if(!props.ship){
		return "Loading..."
	}


		return (
			<Fragment>
				<p>
					{props.ship.name}
				</p>
			</Fragment>
		)
	}

export default Ship;
