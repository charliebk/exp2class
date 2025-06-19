class IfcRelDeclares extends IfcRelationship {
    constructor() {
        /** @type {IFCCONTEXT} */
        this.RelatingContext = null;
        /** @type {SET [1:?] OF IFCDEFINITIONSELECT} */
        this.RelatedDefinitions = null;
    }

    // === WHERE CLAUSES ===
    // NoSelfReference : SIZEOF(QUERY(Temp <* RelatedDefinitions | RelatingContext :=: Temp)) = 0
}
