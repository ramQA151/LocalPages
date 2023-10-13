
require ('@4tw/cypress-drag-drop')
describe('Mouse Handling', () => {

    
    it('Drag and Drop', () =>{

        cy.visit('http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html')
        cy.wait(3000)
       cy.get('#box6').drag('#box106',{force:true})

  
    })
})