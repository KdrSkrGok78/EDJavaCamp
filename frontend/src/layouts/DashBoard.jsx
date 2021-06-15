import React from 'react'
import Categories from './Categories'
import JobTitleList from '../pages/JobTitleList'
import JobAdvertisementList from '../pages/JobAdvertisementList'
import EmployerList from '../pages/EmployerList'
import CandidateList from '../pages/CandidateList'
import CvList from '../pages/CvList'
import { Grid } from 'semantic-ui-react'

export default function DashBoard() {
    return (
        <div>
            <Grid>
                <Grid.Row>
                    <Grid.Column width ={4}>
                        <Categories />
                    </Grid.Column>
                    <Grid.Column width ={12}>
                        <JobTitleList />
                    </Grid.Column>
                    <Grid.Column floated='right' width ={12}>
                    <JobAdvertisementList />
                    </Grid.Column>
                    <Grid.Column floated='right' width ={12}>
                    <CvList />
                    </Grid.Column>
                    <Grid.Column floated='right' width ={12}>
                    <EmployerList />
                    </Grid.Column>
                    <Grid.Column floated='right' width ={12}>
                    <CandidateList />
                    </Grid.Column>
                   
                </Grid.Row>
            </Grid>


        </div>
    )
}
