import React, {Fragment} from 'react';
import {BrowserRouter as Router, Route, Switch} from 'react-router-dom';
import NavBar from '../NavBar.js';
import PirateContainer from './PirateContainer';
import RaidContainer from './RaidContainer';
import ShipContainer from './ShipContainer';

const MainContainer = () => {

    return (
      <Router>
        <Fragment>
        <NavBar/>
          <Switch>
            <Route path="/pirates" component={PirateContainer}/>
            <Route path="/raids" component={RaidContainer}/>
            <Route path="/ships" component={ShipContainer}/>
          </Switch>


        </Fragment>
      </Router>
    )
}

export default MainContainer;
