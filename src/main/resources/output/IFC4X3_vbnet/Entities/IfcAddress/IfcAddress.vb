Public Class IfcAddress
    Public Purpose As IfcAddressTypeEnum
    Public Description As IfcText
    Public UserDefinedPurpose As IfcLabel

    ' === EXTENDED BY ===
    ' IfcPostalAddress
    ' IfcTelecomAddress

    ' === INVERSE CLAUSES ===
    ' OfPerson : SET [0:?] OF IfcPerson FOR Addresses
    ' OfOrganization : SET [0:?] OF IfcOrganization FOR Addresses

    ' === WHERE CLAUSES ===
    ' WR1 : (NOT(EXISTS(Purpose))) OR ((Purpose <> IfcAddressTypeEnum.USERDEFINED) OR ((Purpose = IfcAddressTypeEnum.USERDEFINED) AND EXISTS(SELF.UserDefinedPurpose)))
End Class
