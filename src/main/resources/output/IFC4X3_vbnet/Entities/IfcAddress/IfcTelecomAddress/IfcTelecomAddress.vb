Public Class IfcTelecomAddress Inherits IfcAddress
    Public TelephoneNumbers As List(Of IfcLabel)
    Public FacsimileNumbers As List(Of IfcLabel)
    Public PagerNumber As IfcLabel
    Public ElectronicMailAddresses As List(Of IfcLabel)
    Public WWWHomePageURL As IfcURIReference
    Public MessagingIDs As List(Of IfcURIReference)

    ' === WHERE CLAUSES ===
    ' MinimumDataProvided : EXISTS (TelephoneNumbers) OR EXISTS (FacsimileNumbers) OR EXISTS (PagerNumber) OR EXISTS (ElectronicMailAddresses) OR EXISTS (WWWHomePageURL) OR EXISTS (MessagingIDs)
End Class
