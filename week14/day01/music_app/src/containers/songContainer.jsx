import React, {Component} from 'react';
import SongDisplay from "../components/songDisplay.jsx";


class SongContainer extends Component {
  constructor(props){
    super(props);

    this.state = {
      songs: []
    };
  }

  render(){
      return (
        <div>
          <SongDisplay songs={this.state.songs} />
        </div>
      )
  }

  componentDidMount(){
    const url = "https://itunes.apple.com/gb/rss/topsongs/limit=20/json";

    fetch(url)
    .then(res => res.json())
    .then(songs => this.setState({ songs: songs.feed.entry }))
    .catch(err => console.err)
  }

}

export default SongContainer;
