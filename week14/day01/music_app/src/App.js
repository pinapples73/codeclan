import React, {Component} from 'react';
import SongContainer from "./containers/songContainer.jsx";

class App extends Component {
  render() {
    return (
      <div>
        <h2>Hey Music Lover!</h2>
        <SongContainer />
      </div>
    );
  }
}

export default App;
