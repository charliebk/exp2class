class IfcProject extends IfcContext {
    constructor() {
        // no parameters
    }

    // === WHERE CLAUSES ===
    // CorrectContext : NOT(EXISTS(SELF\IfcContext.RepresentationContexts)) OR (SIZEOF(QUERY(Temp <* SELF\IfcContext.RepresentationContexts | 'IFC4X3_DEV_73740fe4.IFCGEOMETRICREPRESENTATIONSUBCONTEXT' IN TYPEOF(Temp) )) = 0)
    // HasName : EXISTS(SELF\IfcRoot.Name)
    // NoDecomposition : SIZEOF(SELF\IfcObjectDefinition.Decomposes) = 0
}
