public class IfcMaterialDefinitionRepresentation extends IfcProductRepresentation {
    public IfcMaterial RepresentedMaterial;

    // === WHERE CLAUSES ===
    // OnlyStyledRepresentations : SIZEOF(QUERY(temp <* Representations | (NOT('IFC4X3_DEV_73740fe4.IFCSTYLEDREPRESENTATION' IN TYPEOF(temp))) )) = 0
}
