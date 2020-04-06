import React, {Component} from "react";
import SongDetail from "./songDetail.jsx";

  class SongDisplay extends Component {
    render(){
      const songList = this.props.songs.map((song, index) => {
        return (
          <SongDetail key={song.id.attributes['im:id']} song={song} chartPosition={index} imgUrl={song['im:image'][2]['label']}/>
        )
      })


      return (
          <ul>
            {songList}
          </ul>
        )
      }
}


export default SongDisplay;
