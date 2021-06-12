import React from "react";
import CandidateList from "../pages/CandidateList";
import JobTitleList from "../pages/JobTitleList";
import JobAdvertisementList from "../pages/JobAdvertisementList";
import Navi from "./Navi";
import Categories from "./Categories";
import { Container, Grid, GridColumn } from "semantic-ui-react";
import { Route } from "react-router";
import EmployerList from "../pages/EmployerList";



export default function Dashboard() {
  return (
    <div>
      <Navi/>
      <Container>
        <Grid>
          <GridColumn width={4}>
            <Categories />
          </GridColumn>
          <GridColumn width={12}>
            <Route exact path={"/employers"} component={EmployerList}/>
            <Route exact path={"/candidates"} component={CandidateList} />
            <Route exact path={"/jobtitles"} component={JobTitleList}/>
            <Route exact path={"/jobadvertisements"} component={JobAdvertisementList}/>
          </GridColumn>
        </Grid>
      </Container>

      {/* 
      
      <JobAdvertisementList />
      */}
    </div>
  );
}
