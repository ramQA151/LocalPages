
///<reference types="Cypress" />
 describe("Handling Dropdown",() =>

    {
        //We have to use "it.skip" to skip any method in cypress
     it.skip('Dropdown with Select', () =>
     {
     cy.visit("https://rahulshettyacademy.com/AutomationPractice/")
    
     cy.get('select#dropdown-class-example')
     .select("option1")
     .should('have.value', 'option1')
     })
       
    it.skip('Auto Suggested Dropdowns', () =>
    {
    cy.visit("https://www.dummyticket.com/dummy-ticket-for-visa-application/")
   
    cy.get('span#select2-billing_country-container').click()
    
    cy.get('input.select2-search__field').type('Italy').type('{enter}')
    
    cy.get('span#select2-billing_country-container')
    .should('have.text', 'Italy')

   })

     // Dropdown without select --BootStrap Element--

     it('Dropdown without Select', () =>
     {
     cy.visit("https://www.wikipedia.org/")
    
     cy.get('input#searchInput').type('Maharashtra')

     // Get All Autosuggestions
     cy.get('h3.suggestion-title').contains(' Cricket Association Stadium').click()
    })


     // Dropdown without select --BootStrap Element--

     it.skip('Dynamic Dropdown', () =>
     {
     cy.visit("https://www.google.com/")
    
     cy.get('#APjFqb').type('CypressAutomation')

     cy.wait(4000)

     cy.get('div.wM6W7d>span').should('have.length',12)

     // Get All Dynamic Autosuggestions
     cy.get('div.wM6W7d>span').each(($el, index, $list) =>{
        if($el.text()=='cypress automation tool')
        cy.wait(4000)
        {

            cy.wrap($el).click()
        }
     })
     cy.get('#APjFqb').should('have.value', 'cypress automation tool')
    
    })

    })