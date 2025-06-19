class IfcContext extends IfcObjectDefinition {
    constructor() {
        /** @type {IFCLABEL} */
        this.ObjectType = null;
        /** @type {IFCLABEL} */
        this.LongName = null;
        /** @type {IFCLABEL} */
        this.Phase = null;
        /** @type {SET [1:?] OF IFCREPRESENTATIONCONTEXT} */
        this.RepresentationContexts = null;
        /** @type {IFCUNITASSIGNMENT} */
        this.UnitsInContext = null;
    }

    // === EXTENDED BY ===
    // IfcProject
    // IfcProjectLibrary

    // === INVERSE CLAUSES ===
    // IsDefinedBy : SET [0:?] OF IfcRelDefinesByProperties FOR RelatedObjects
    // Declares : SET [0:?] OF IfcRelDeclares FOR RelatingContext
}
