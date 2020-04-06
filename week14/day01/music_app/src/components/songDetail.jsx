import React, {Component} from "react";

  class SongDetail extends Component {
    render() {
      return (
        <li>
          {this.props.chartPosition + 1} &nbsp;
          {this.props.song['im:name']['label']} &nbsp;
          {this.props.song['im:artist']['label']} &nbsp;
          <p></p>
          <img src={this.props.imgUrl} alt="cover art" height="100"/>
        </li>
      )
    }
  }

  export default SongDetail;
