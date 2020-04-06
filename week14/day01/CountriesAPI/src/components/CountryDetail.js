import React from 'react';

const CountryDetail = (props) => {
  if(!props.country) return null;
  return (
    <div>
      <h3> country name:
        {props.country.name}
      </h3>
      <p>native name: {props.country.nativeName}</p>
      <p>population: {props.country.population}</p>
      <p>region: {props.country.region}</p>
    </div>
  )
}

export default CountryDetail;
