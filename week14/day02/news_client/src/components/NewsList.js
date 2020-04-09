import React from 'react';

const NewsList = (props) => {

//
//   if(props.stories) {
//       const storyDetail = props.stories.map(story => {
//         return <p key = {story.id}>
//         <h4>Title: &nbsp; {story.title}</h4>
//         Author: &nbsp;{story.by}
//         <br></br>
//         <a href={`${story.url}`}> Click for full story </a>
//         <hr></hr>
//         </p>
//       })
//
//       return (
//         <div>
//           <p>
//             <h4 color="blue">Title: &nbsp; {props.selectedStory.title}</h4>
//             Author: &nbsp;{props.selectedStory.by}
//             <br></br>
//             <a href={`${props.selectedStory.url}`}> Click for full story </a>
//             <hr></hr>
//           </p>
//           {storyDetail}
//           </div>
//         )
//     } else {
//         return null
//     }
//

      if(!props.stories) {
        const storyDetail = null;
      } else {
         if(!props.selectedStory) {
           const storyDetail = props.stories.map(story => {
             return <p key = {story.id}>
             <h4>Title: &nbsp; {story.title}</h4>
             Author: &nbsp;{story.by}
             <br></br>
             <a href={`${story.url}`}> Click for full story </a>
             <hr></hr>
             </p>
           })
         } else {
          const storyDetail = null;
         }
         return (
           <div>
           {storyDetail}
           </div>
         )
      }





}


export default NewsList;
