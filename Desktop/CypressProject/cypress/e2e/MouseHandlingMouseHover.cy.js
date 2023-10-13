
describe('Mouse Handling', () => {

    
    it('Mouse Hover', () =>{

        cy.visit('https://www.flipkart.com/account/login?ret=/')

        //cy.get("a[title='Mi']").should('not.be.visible');

        cy.wait(5000)
        cy.get('._1kidPb > :nth-child(1)').trigger('mouseover');
        cy.wait(2000)
        cy.get('._1kidPb > :nth-child(2)').trigger('mouseover');
        cy.wait(2000)
        cy.get('._1kidPb > :nth-child(3)').trigger('mouseover');
        cy.wait(2000)
        cy.get('._1kidPb > :nth-child(4)').trigger('mouseover');
        cy.wait(2000)
        cy.get('._1kidPb > :nth-child(5)').trigger('mouseover');
        cy.wait(2000)
        cy.get('._1kidPb > :nth-child(6)').trigger('mouseover');
        cy.wait(2000)
        cy.get('._1kidPb > :nth-child(7)').trigger('mouseover');
        
        cy.get('._1kidPb > :nth-child(1)').trigger('mouseover').click();
        cy.get("a[title='Mi']").should('be.visible');
        cy.get("a[title='Mi']").click();
    })
})