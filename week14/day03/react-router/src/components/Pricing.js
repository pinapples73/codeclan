import React from "react";

const Pricing = (props) => {
  const listItems = props.prices.map((price, index) => {
    return <li key={index}> {price.level}: £{price.cost} per month </li>
  })
  return(
    <div>
      <h4>Pricing</h4>
      <ul>
        {listItems}
      </ul>
    </div>
  )
}


export default Pricing;
