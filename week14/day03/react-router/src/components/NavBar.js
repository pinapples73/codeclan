import React from 'react';
import {Link} from 'react-router-dom';

const NavBar = () => (
<ul>
  <li>
    <Link to="/">Home</Link>
  </li>
  <li>
    <Link to="/">About</Link>
  </li>
  <li>
    <Link to="/">Pricing</Link>
  </li>
</ul>
)

export default NavBar;