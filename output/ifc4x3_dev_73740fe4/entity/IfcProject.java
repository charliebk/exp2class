package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcProject extends IfcContext {

    // INVERSE attributes:
    // CorrectContext : NOT(EXISTS(SELF\IfcContext.RepresentationContexts)) OR
    // (SIZEOF(QUERY(Temp <* SELF\IfcContext.RepresentationContexts |
    // 'IFC4X3_DEV_73740fe4.IFCGEOMETRICREPRESENTATIONSUBCONTEXT' IN TYPEOF(Temp)
    // )) = 0);
    // HasName : EXISTS(SELF\IfcRoot.Name);
    // NoDecomposition : SIZEOF(SELF\IfcObjectDefinition.Decomposes) = 0;

    // WHERE constraints:
    // CorrectContext : NOT(EXISTS(SELF\IfcContext.RepresentationContexts)) OR
    // (SIZEOF(QUERY(Temp <* SELF\IfcContext.RepresentationContexts |
    // 'IFC4X3_DEV_73740fe4.IFCGEOMETRICREPRESENTATIONSUBCONTEXT' IN TYPEOF(Temp)
    // )) = 0);
    // HasName : EXISTS(SELF\IfcRoot.Name);
    // NoDecomposition : SIZEOF(SELF\IfcObjectDefinition.Decomposes) = 0;
}
