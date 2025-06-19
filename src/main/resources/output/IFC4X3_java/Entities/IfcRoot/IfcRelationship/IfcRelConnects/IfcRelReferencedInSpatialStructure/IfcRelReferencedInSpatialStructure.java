public class IfcRelReferencedInSpatialStructure extends IfcRelConnects {
    public SET [1:?] OF IfcSpatialReferenceSelect RelatedElements;
    public IfcSpatialElement RelatingStructure;

    // === WHERE CLAUSES ===
    // AllowedRelatedElements : SIZEOF(QUERY(temp <* RelatedElements | ('IFC4X3_DEV_73740fe4.IFCSPATIALSTRUCTUREELEMENT' IN TYPEOF(temp)) AND (NOT ('IFC4X3_DEV_73740fe4.IFCSPACE' IN TYPEOF(temp))) )) = 0
}
