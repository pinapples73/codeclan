import React, { Component } from 'react';
class PiggyBank extends Component {

    constructor(props) {
        super(props);
        this.state = {
            total: 0
        };
        this.deposit = this.deposit.bind(this);
        this.withdraw = this.withdraw.bind(this);
    }

    deposit() {
        this.setState(prevState => {
            return {total: prevState.total + this.props.depositAmount}
        });
    }

    withdraw(){
      this.setState(prevState => {
        let newAmount = prevState.total - this.props.depositAmount;
        if(newAmount<0) {
          newAmount = 0;
        }
        return {total:newAmount};
      })
    }

    render() {
        return (
            // 👇 N.B.this is shorthand for Fragment!
            <>
                <h1> { this.props.title } </h1>
                <p> Total: £ {this.state.total} </p>
                <button onClick={this.deposit}>Deposit</button>
                <button onClick={this.withdraw}>Withdraw</button>
            </>
        )
    }

}
export default PiggyBank;
