import React, { useState , useEffect} from 'react'
import { Icon, Label, Menu, Table } from 'semantic-ui-react'
import JobAdvertisementService from '../services/jobAdvertisementService'

export default function JobAdvertisementList() {

    
  const [jobAdvertisements, setJobAdvertisement] = useState([])

  useEffect(() => {
    let jobAdvertisementService = new JobAdvertisementService()
    jobAdvertisementService.getJobAdvertisement().then(result => setJobAdvertisement(result.data.data))
  })

    return (
        <div>
            <Table celled>
        <Table.Header>
          <Table.Row>
            <Table.HeaderCell>Job Titles</Table.HeaderCell>
            <Table.HeaderCell>Employer</Table.HeaderCell>
            <Table.HeaderCell>Employer Number</Table.HeaderCell>
            <Table.HeaderCell>Last Date</Table.HeaderCell>
            <Table.HeaderCell>Request Position</Table.HeaderCell>
            <Table.HeaderCell>Salary</Table.HeaderCell>

          </Table.Row>
        </Table.Header>

        <Table.Body>
          {jobAdvertisements.map(jobAdvertisement => (
            <Table.Row>
              <Table.Cell>
              {jobAdvertisement.jobTitle.jobName}
              {jobAdvertisement.employer.companyName}
              {jobAdvertisement.employer.phoneNumber}
              {jobAdvertisement.lastDate}
              {jobAdvertisement.positionNumber}
              {jobAdvertisement.salary}
              </Table.Cell>
            </Table.Row>
          ))}

        </Table.Body>

        <Table.Footer>
          <Table.Row>
            <Table.HeaderCell colSpan='3'>
              <Menu floated='right' pagination>
                <Menu.Item as='a' icon>
                  <Icon name='chevron left' />
                </Menu.Item>
                <Menu.Item as='a'>1</Menu.Item>
                <Menu.Item as='a'>2</Menu.Item>
                <Menu.Item as='a'>3</Menu.Item>
                <Menu.Item as='a'>4</Menu.Item>
                <Menu.Item as='a' icon>
                  <Icon name='chevron right' />
                </Menu.Item>
              </Menu>
            </Table.HeaderCell>
          </Table.Row>
        </Table.Footer>
      </Table>
        </div>
    )
}
