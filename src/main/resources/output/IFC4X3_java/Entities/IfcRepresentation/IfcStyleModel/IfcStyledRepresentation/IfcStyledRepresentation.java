public class IfcStyledRepresentation extends IfcStyleModel {

    // === WHERE CLAUSES ===
    // OnlyStyledItems : SIZEOF(QUERY(temp <* SELF\IfcRepresentation.Items | (NOT('IFC4X3_DEV_73740fe4.IFCSTYLEDITEM' IN TYPEOF(temp))) )) = 0
}
