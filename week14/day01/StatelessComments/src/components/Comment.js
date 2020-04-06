// import React, { Component } from "react";
import React from "react";


// class Comment extends Component {
//   render() {
//     return (
//       <li className="comment">
//         <h4>{this.props.children}</h4>
//         <p>{this.props.author}</p>
//       </li>
//     );
//   }
// }
const Comment = ({children, author}) => {
  return(
    <li className="comment">
      <h4>{children}</h4>
      <p>{author}</p>
    </li>
  )
}
//
export default Comment;
//
