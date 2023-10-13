//before     - will execute before starting all it blocks(tests)            - Runs only once
//after      - will execute only once after completing all it blocks(tests) - Only once
//beforeEach - will execute every time before starting  it block(test)      - Every time
//afterEach  - will execute every time after completing  it block(test)     - Every time

describe('My test suite', ()=>{


    before(()=>{

        cy.log("****Launch Application***")

    })

    //Order is nit important in cypress we can write it anywhere
    after(()=>{

        cy.log("****Close Application***")
        
    })

    beforeEach(()=>{

        cy.log("****Login***")
        
    })

    afterEach(()=>{

        cy.log("****Logout***")
        
    })

it('search',()=>{

    cy.log("*** searching****")
    
})

it('search',()=>{

    cy.log("*** advanced searching****")
    
})

it('search',()=>{

    cy.log("*** Listing products ****")
    
})


})