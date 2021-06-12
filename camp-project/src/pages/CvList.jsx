import React, { useState, useEffect } from "react";
import { Icon, Menu, Table } from "semantic-ui-react";
import CvService from "../services/cvService";

export default function CvList() {
  const [cvs, setCvs] = useState([]);

  useEffect(()=>{
      let cvService = new CvService()
      cvService.getCvs().then(result=>setCvs(result.data.data))
  },[])

  return (
    <div>
    <Table celled inverted selectable>
    <Table.Header>
      <Table.Row>
        <Table.HeaderCell>Name</Table.HeaderCell>
        <Table.HeaderCell>Status</Table.HeaderCell>
        <Table.HeaderCell>Notes</Table.HeaderCell>
      </Table.Row>
    </Table.Header>

    <Table.Body>
      {cvs.map(cv => (
          <Table.Row>
        <Table.Cell>{cv.id}</Table.Cell>
        <Table.Cell>{cv.candidate}</Table.Cell>
        <Table.Cell>{cv.experienceInfos}</Table.Cell>
        <Table.Cell>{cv.foreignLanguages}</Table.Cell>
        <Table.Cell>{cv.programmeLanguages}</Table.Cell>
        <Table.Cell>{cv.schoolInfos}</Table.Cell>
        
        <Table.Cell textAlign='right'>None</Table.Cell>
      </Table.Row>)
      )}
    </Table.Body>
  </Table>
    </div>
  );
}
